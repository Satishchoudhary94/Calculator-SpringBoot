package com.satish.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index.jsp";
    }

    @RequestMapping("calculate")
    public String calculate(HttpServletRequest req, HttpSession session) {
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        String operation = req.getParameter("operation");

        int result = 0;
        String message = "";

        switch (operation) {
            case "add":
                result = num1 + num2;
                message = "Addition: " + result;
                break;
            case "subtract":
                result = num1 - num2;
                message = "Subtraction: " + result;
                break;
            case "multiply":
                result = num1 * num2;
                message = "Multiplication: " + result;
                break;
            case "divide":
                if (num2 != 0) {
                    result = num1 / num2;
                    message = "Division: " + result;
                } else {
                    message = "Error: Division by zero!";
                }
                break;
        }

        session.setAttribute("result", message);
        return "result.jsp";
    }
}
