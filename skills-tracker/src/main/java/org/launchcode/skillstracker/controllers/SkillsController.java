package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @RequestMapping(value="")
    @ResponseBody
    public String SkillsTracker() {
        String html = "<h1> Skills Tracker </h1>" +
                "<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
                "<ol> " +
                "<li> java </li>" +
                "<li> javaScript </li>" +
                "<li> Python </li>" +
                "</ol>";
        return html;
    }
    @GetMapping("form")
    @ResponseBody
    public String optionalForm(){
        return "<form method = 'post'>" +
                "Name: <br>" +
                "<input type= 'text' name= 'name' id= 'name'/><br>" +
                " My Favorite language: <br>" +
                "<select id='firstLang' name= 'firstLang'>" +
                "<option value='java' >Java</option>" +
                "<option value='JavaScript' >JavaScript</option>" +
                "<option value='Python' >Python</option>" +
                "</select><br>" +
                " My Second language: <br>" +
                "<select id='secondLang' name= 'secondLang'>" +
                "<option value='java' >Java</option>" +
                "<option value='JavaScript' >JavaScript</option>" +
                "<option value='Python' >Python</option>" +
                "</select><br>" +
                " My Third language: <br>" +
                "<select id='thirdLang' name= 'thirdLang'>" +
                "<option value='java' >Java</option>" +
                "<option value='JavaScript' >JavaScript</option>" +
                "<option value='Python' >Python</option>" +
                "</select><br>" +
                "<input type= 'submit' value='Submit'/><br>" +
                "</form>";
    }
    @PostMapping(value="form")
    @ResponseBody
    public String namePage(@RequestParam String name , @RequestParam String firstLang , @RequestParam String secondLang , @RequestParam String thirdLang ){
        return "<table border=\"10\"\n" +
                "       style=\"background-color: aqua; border-color: red blue gold teal;\">" +
                "<tr>" +
          "<th>" + "first Language" + "</th>" +
          "<th>" + "Second Language" + "</th>" +
          "<th>" + "Third Language" +  "</th>" +
                "</tr>" +
                "<h1 style=\"color:red;\">" + "<em>" + name + "</em>" + "</h1>" +
                "<tr>" +
                "<td>" + firstLang + "</td>" +
                "<td>" + secondLang + "</td>" +
                "<td>" + thirdLang + "</td>" +
                "</tr>" +
                "</table>"
                ;
    }
}
