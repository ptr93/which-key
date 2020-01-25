import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowEP
import javax.swing.JPanel

class TestWindow(val toolWindow : ToolWindow) : ToolWindowEP()
{
    private val myToolWindowContent: JPanel? = null

    fun getContent(): JPanel? {
        return myToolWindowContent
    }
}
