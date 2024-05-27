<div align='center'>
	<h2>EasyLauncher - Minimal and Clutter Free Android launcher</h2>
    <table align='center'>
        Click on any image to enlarge it. To know more, explore and see for yourself.
        <tr>
            <td><img src='fastlane/metadata/android/en-US/images/phoneScreenshots/0.png' width='100' alt=""></td>
            <td><img src='fastlane/metadata/android/en-US/images/phoneScreenshots/1.png' width='100' alt=""></td>
            <td><img src='fastlane/metadata/android/en-US/images/phoneScreenshots/2.png' width='100' alt=""></td>
            <td><img src='fastlane/metadata/android/en-US/images/phoneScreenshots/3.png' width='100' alt=""></td>
        </tr>
	<tr>
            <td><img src='fastlane/metadata/android/en-US/images/phoneScreenshots/4.png' width='100' alt=""></td>
            <td><img src='fastlane/metadata/android/en-US/images/phoneScreenshots/5.png' width='100' alt=""></td>
            <td><img src='fastlane/metadata/android/en-US/images/phoneScreenshots/6.png' width='100' alt=""></td>
            <td><img src='fastlane/metadata/android/en-US/images/phoneScreenshots/7.png' width='100' alt=""></td>
	</tr>
    </table>
    <p>
        <a href='https://f-droid.org/packages/app.easy.launcher'><img src='https://github.com/DroidWorksStudio/mLauncher/assets/9284733/a1e7c86f-1c76-46c0-9193-8fde9c9f531c' width="150" alt="fDroid"></a>
        <a href='http://apps.obtainium.imranr.dev/redirect.html?r=obtainium://add/https://github.com/DroidWorksStudio/EasyLauncher'><img src='https://github.com/DroidWorksStudio/mLauncher/assets/9284733/071cccfa-207b-45fb-8be4-7e668eeec4e5' width="150" alt="Obtanium"></a>
    </p>
</div>

<div align='center'>
    <p>
        <img src='https://img.shields.io/badge/Android-3DDC84?style=flat-square&logo=android&logoColor=white' alt="Android">
        <img src='https://img.shields.io/badge/SDK-34-3DDC84?style=flat-square' alt="SDK-34">
        <a href='https://github.com/DroidWorksStudio/EasyLauncher/blob/main/LICENSE'><img src='https://img.shields.io/github/license/DroidWorksStudio/EasyLauncher?color=3DDC84&style=flat-square' alt="LICENSE"></a>
        <br>
        <img src='https://img.shields.io/badge/Maintained-yes-44cc11?style=flat-square' alt="Maintained">
        <a href='https://github.com/DroidWorksStudio/EasyLauncher/releases/latest'><img src='https://img.shields.io/github/downloads/DroidWorksStudio/EasyLauncher/total?color=44cc11&style=flat-square' alt="releases"></a>
        <br>
        <a href='https://gitlab.com/fdroid/fdroiddata/-/blob/master/metadata/app.easy.launcher.yml'><img alt="F-Droid (including pre-releases)" src="https://img.shields.io/f-droid/v/app.easy.launcher?include_prereleases&style=flat-square"></a>
        <a href='https://github.com/DroidWorksStudio/EasyLauncher/releases/latest'><img alt="GitHub release (latest by date)" src="https://img.shields.io/github/v/release/DroidWorksStudio/EasyLauncher?style=flat-square"></a>
    </p>
</div>


## About

#### Easy Launcher - the minimalist productivity launcher for focus, productivity, keep your focus on what really counts.

- Chat with us at [EasyLauncher](https://t.me/DroidWorksStudio) on telegram.
- This application can be found on [F-Droid](https://f-droid.org/packages/app.easy.launcher/) and [Github](https://github.com/HeCodes2Much/EasyLauncher/releases/).
- The latest stable version is available on the [`main`](https://github.com/HeCodes2Much/EasyLauncher/tree/main) branch, which can be cloned to build the application independently.
- Additionally, a Github action has been set up to automatically generate an APK for every [release](https://github.com/HeCodes2Much/EasyLauncher/releases).
- The **original** version of the application is also accessible on the [Play Store](https://play.google.com/store/apps/details?id=com.series.aster.launcher), [F-Droid](https://f-droid.org/fr/packages/com.series.aster.launcher/) & [Github](https://github.com/neophtex/AsterLauncher).

We try to balance customizability and minimalization well still being simple :)</h3>

## Features

- Favorite App Quick Access: Display your favorite apps in text format on the home screen for swift access to your most-used apps, streamlining your operations.

- Hide Apps: Easily conceal apps that you don't want to be visible, keeping your home screen clean and focused on the content you need.

- App Locking: Secure your privacy and data by fingerprint to lock selected apps.

- Personalized Customization: Choose the font color and position for time, date, and favorite apps, making your home screen truly reflect your style.



## Contribute

- If you are unhappy with any part of the app or feel like missing something, you can open a pull request or an [**issue**](https://github.com/HeCodes2Much/EasyLauncher/issues/new/choose) as you like.
    - Please go through the issues marked as `Bug report`, `Crash report` or `Feature request`.
    - Please can we discuss before sending pull requests.
    - Make pull requests to `main` branch.
- Any help in translating EasyLauncher into other languages is greatly appreciated. [**Crowdin**](https://crowdin.com/project/easy-launcher).

## Credits

- [https://gitlab.com/neophtex/AsterLauncher](https://gitlab.com/neophtex/AsterLauncher)

## License

**EasyLauncher is proudly licensed under the open source GPL3 license, granting users the freedom to use, study, modify and distribute it at will.**

The Copyleft provision guarantees that these freedoms remain intact, ensuring that EasyLauncher will remain a fully open-source project. With access to the full source code, anyone can build, fork, and customize the application to their heart's content, unleashing its full potential.

- EasyLauncher does not have network access.
- EasyLauncher does not collect or transmit any data in any way whatsoever.

## Permissions

EasyLauncher uses the following permissions:

- `android.permission.EXPAND_STATUS_BAR`
    - Allows an application to expand or collapse the status bar.
- `android.permission.QUERY_ALL_PACKAGES`
    - Allows query of any normal app on the device, regardless of manifest declarations. Used to show the apps list.
- `android.alarm.permission.SET_ALARM`
    - Allows an application to broadcast an Intent to set an alarm for the user. Used to open the default alarm app if no other clock app is set in the settings.
- `android.permission.REQUEST_DELETE_PACKAGES`
    - Required for issuing the request to remove packages. This does not allow the app to remove apps directly; this only gives the permission to issue the request.
- `android.permission.PACKAGE_USAGE_STATS`
    - Allows EasyLauncher to see usage of other apps to list last used apps first in the app list.


## Donation

We kindly request that you consider supporting the ongoing development of EasyLauncher by making a donation if you find it to be a useful application. As a free and open-source product, EasyLauncher depends entirely on the support and generosity of its users to maintain its continued growth and accessibility to all. Please note that while purchasing is not obligatory, even a small donation would go a long way in helping us to keep EasyLauncher alive and thriving. We appreciate your continued support, and thank you for your contribution towards the betterment of our product. 😊

<div align='center'>
<a href="https://www.buymeacoffee.com/HeCodes2Much"><img src="https://img.buymeacoffee.com/button-api/?text=Buy me a coffee&emoji=&slug=HeCodes2Much&button_colour=FFDD00&font_colour=000000&font_family=Cookie&outline_colour=000000&coffee_colour=ffffff" /></a>
</div>
