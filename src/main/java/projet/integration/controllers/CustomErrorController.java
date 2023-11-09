package projet.integration.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // Gérez l'erreur et renvoyez une page d'erreur personnalisée
        return "pageErreur"; // Remplacez "pageErreur" par le nom réel de votre page d'erreur personnalisée
    }

    public String getErrorPath() {
        return "/error";
    }
}
