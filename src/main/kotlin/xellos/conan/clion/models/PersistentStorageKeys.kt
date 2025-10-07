package xellos.conan.clion.models

class PersistentStorageKeys {
    companion object {
        const val HAS_BEEN_SETUP = "xellos.conanplugin.hasbeensetup"
        const val AUTOMATIC_ADD_CONAN = "xellos.conanplugin.addconansupport"
        // CONAN_EXECUTABLE can have 3 states:
        // - value="/path/configured/by/user" the user entered a path
        // - value="conan" the user selected "Use conan from system"
        // - value="" not yet configured
        const val CONAN_EXECUTABLE = "xellos.conanplugin.conanexecutable"
        const val AUTOMANAGE_CMAKE_ADVANCED_SETTINGS = "xellos.conanplugin.automanage.cmake.advanced.settings"
    }
}
