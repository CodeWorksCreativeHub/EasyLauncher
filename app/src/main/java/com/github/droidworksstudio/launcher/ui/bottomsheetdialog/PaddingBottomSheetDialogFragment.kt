package com.github.droidworksstudio.launcher.ui.bottomsheetdialog

import android.content.DialogInterface
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.viewModels
import com.github.droidworksstudio.launcher.databinding.BottomsheetdialogPaddingSettingsBinding
import com.github.droidworksstudio.launcher.helper.AppHelper
import com.github.droidworksstudio.launcher.helper.BottomDialogHelper
import com.github.droidworksstudio.launcher.helper.PreferenceHelper
import com.github.droidworksstudio.launcher.viewmodel.PreferenceViewModel
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class PaddingBottomSheetDialogFragment : BottomSheetDialogFragment() {

    private var _binding: BottomsheetdialogPaddingSettingsBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var preferenceHelper: PreferenceHelper

    @Inject
    lateinit var appHelper: AppHelper

    @Inject
    lateinit var bottomDialogHelper: BottomDialogHelper

    private val preferenceViewModel: PreferenceViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BottomsheetdialogPaddingSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }

    override fun onPause() {
        super.onPause()
        dismiss()  // Close the PaddingBottomSheetDialogFragment when the home button is pressed.
    }

    private fun initView() {
        bottomDialogHelper.setupDialogStyle(dialog)

        binding.selectAppPaddingSize.setText("${preferenceHelper.homeAppPadding}")
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    private fun observeValueChange() {
        val appValue = binding.selectAppPaddingSize.text.toString()

        val appFloatValue = parseFloatValue(appValue, preferenceHelper.homeAppPadding)
        dismiss()

        preferenceViewModel.setAppPaddingSize(appFloatValue)
        val feedbackType = "select"
        appHelper.triggerHapticFeedback(context, feedbackType)
    }

    private fun parseFloatValue(text: String, defaultValue: Float): Float {
        if (text.isEmpty() || text == "0") {
            return defaultValue
        }
        return text.toFloat()
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)

        observeValueChange()
    }
}