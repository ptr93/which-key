import com.intellij.ide.BrowserUtil
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class TestAction : AnAction()
{
    override fun actionPerformed(e: AnActionEvent) {
        BrowserUtil.browse("https://www.google.it")
    }
}
