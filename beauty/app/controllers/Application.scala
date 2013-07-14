package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok("Your new application is ready.")
  }
    
  def tasks = TODO
  
  def newTask = TODO
  
  def deleteTask(id: Long) = TODO
  
}