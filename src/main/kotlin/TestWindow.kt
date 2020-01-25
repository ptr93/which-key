import com.google.gson.Gson
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowEP
import java.io.File
import javax.swing.JPanel

class TestWindow(val toolWindow : ToolWindow) : ToolWindowEP()
{
    private val myToolWindowContent: JPanel? = null

    private fun loadSettings(): shortcutModel?
    {
        val settingsFile = File("./test/resources/testCommands.json")
        val settingsJson: String = settingsFile.readText()
        return Gson().fromJson(settingsJson, shortcutModel::class.java)
    }

    fun getContent(): JPanel?
    {
        print(loadSettings())
        return myToolWindowContent
    }
}
