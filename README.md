# MobTime Plugin

![Build](https://github.com/JStruk/mobtime-plugin/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/16137.svg)](https://plugins.jetbrains.com/plugin/16137-mobtime)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/16137.svg)](https://plugins.jetbrains.com/plugin/16137-mobtime)


- [ ] Set the [Deployment Token](https://plugins.jetbrains.com/docs/marketplace/plugin-upload.html)

<!-- Plugin description -->
Implements the mob timer from https://mobti.me/ inside a window in IntelliJ IDEs. 
Structure your mob programming without ever leaving the IDE!


<img src="./assets/plugin1.png"/>

Alert when timer is up: 
<div>
<img src="./assets/plugin2.png"/>


<!-- Plugin description end -->

## Installation

- Using IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "mobtime"</kbd> >
  <kbd>Install Plugin</kbd>
   - Please note the plugin is temporarily unavailable on the marketplace until a stable release is deployed. For now, you can use the `Install From Disk` option to install the plugin from the `.zip` downloaded from the versions page [here](https://plugins.jetbrains.com/plugin/16137-mobtime/versions)
  
- Manually:

  Download the [latest release](https://github.com/JStruk/mobtime-plugin/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

## Development

- Setup for local development
  - Requirements:
    - JDK 14
    - JRE 1.8+
    - IntelliJ IDEA
    - Custom runtime for IDEA [Instructions here](https://youtrack.jetbrains.com/issue/IDEA-231833?_ga=2.48638502.1426120811.1614027119-951169486.1614027118#focus=streamItem-27-3993099.0-0)

## Known Issues
 - This plugin requires JCEF support in your IDE. This was released as part of IntelliJ version 2020.2. You may encounter errors such as:
   - `JCEF is not supported in this env or failed to initialize `
   - `JCEF runtime library is not a JBR module`
- The alert logic is based off the webpage title. Ideally we would have a handler for notifications sent from the webpage and handle them properly. If this is possible in CEF, please feel free to put up an issue or a PR with a possible solution :) 
  
  Please post an issue on the repo if you encounter any bugs (especially relating to JCEF). It's appreciated.

---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
