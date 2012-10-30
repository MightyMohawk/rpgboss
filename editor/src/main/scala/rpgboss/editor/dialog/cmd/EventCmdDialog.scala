package rpgboss.editor.dialog.cmd

import scala.swing._
import rpgboss.model.event.EventCmd
import rpgboss.editor.dialog._
import rpgboss.model.event._

object EventCmdDialog {
  /**
   * This function gets a dialog for the given EventCmd
   * 
   * One may argue here that it's not object oriented to case match through
   * all the possible types searching for the right dialog, and that we should
   * use polymorphism.
   * 
   * I generally agree, but feel that adding UI details to the model is 
   * more disgusting than this hack.
   */
  def dialogFor(owner: Window, evtCmd: EventCmd, successF: (EventCmd) => Any) = 
    evtCmd match {
      case e: ShowText => new ShowTextCmdDialog(owner, e, successF)
      
    }
}