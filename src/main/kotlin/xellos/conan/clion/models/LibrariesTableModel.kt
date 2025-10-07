package xellos.conan.clion.models

import javax.swing.table.DefaultTableModel
import xellos.conan.clion.bundles.UIBundle

class LibrariesTableModel(rowCount: Int) : DefaultTableModel(arrayOf(UIBundle.message("libraries.list.table.name")), rowCount) {
    // By default cells are editable and that's no good. Override the function that tells the UI it is
    // TODO: Find the proper configuration for this, this can't be the proper way to make it static
    override fun isCellEditable(row: Int, column: Int): Boolean {
        return false
    }
}
