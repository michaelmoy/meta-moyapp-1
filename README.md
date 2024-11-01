meta-moyapp-1

Layer to hold recipes for an App or two


```
michael@linux-wd:~/MoySandbox/yocto/poky/meta-moyapp-1$ bitbake core-image-minimal
Loading cache: 100% |##########################################################################################################################################################################| Time: 0:00:00
Loaded 3284 entries from dependency cache.
NOTE: Resolving any missing task queue dependencies

Build Configuration:
BB_VERSION           = "1.46.0"
BUILD_SYS            = "x86_64-linux"
NATIVELSBSTRING      = "universal"
TARGET_SYS           = "aarch64-poky-linux"
MACHINE              = "raspberrypi4-64"
DISTRO               = "poky"
DISTRO_VERSION       = "3.1.33"
TUNE_FEATURES        = "aarch64 cortexa72 crc crypto"
TARGET_FPU           = ""
meta
meta-poky
meta-yocto-bsp       = "dunfell:63d05fc061006bf1a88630d6d91cdc76ea33fbf2"
meta-raspberrypi     = "dunfell:2081e1bb9a44025db7297bfd5d024977d42191ed"
meta-oe
meta-python
meta-networking
meta-multimedia      = "dunfell:01358b6d705071cc0ac5aefa7670ab235709729a"
meta-moyapp-1        = "main:a827f6ba911a93d0b15af9ef16cea21fa85ac3d2"

Initialising tasks: 100% |##################

###################################################################################################################################################| Time: 0:00:02
Sstate summary: Wanted 182 Found 0 Missed 182 Current 1108 (0% match, 85% complete)
NOTE: Executing Tasks
NOTE: Tasks Summary: Attempted 3398 tasks of which 3027 didn't need to be rerun and all succeeded.
