package basePackage.Controller;

import basePackage.model.Student;
import basePackage.service.ServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controllerst {
    @Autowired
    private ServiceStudent serviceStudent;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showAll(){
       ModelAndView modelAndView = new ModelAndView("/all");
       modelAndView.addObject("students",serviceStudent.getAll());
        return modelAndView;
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public ModelAndView showForm(){
        return new ModelAndView("addPage","student",new Student());
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("student") Student student){
        if(student.getId() == null)serviceStudent.add(student);
        else serviceStudent.update(student);
        return "redirect:/";
    }

    @RequestMapping(value = "/edit",method = RequestMethod.GET)
    public ModelAndView showEditFrom(@RequestParam(required = true) Long id){
        return  new ModelAndView("addPage", "student",serviceStudent.get(id));
    }
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteStudent(@RequestParam(required = true)Long id){
        serviceStudent.remove(id);
        return "redirect:/";
    }



}
