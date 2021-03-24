package edu.socialnet.controladores;

import edu.socialnet.servicios.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    private UsuarioService servicioUsuarios;

    public HomeController(UsuarioService servicioUsuarios) {
        this.servicioUsuarios = servicioUsuarios;
    }

    @GetMapping(value = "/")
    @ResponseBody
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listaUsuarios", servicioUsuarios.getAll());
        return mav;
    }
}
