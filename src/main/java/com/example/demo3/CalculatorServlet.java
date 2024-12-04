package com.example.demo3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "calculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String number1 = req.getParameter("number1");
        String number2 = req.getParameter("number2");

        String value = req.getParameter("type");
        String result = "Result: ";
        switch (value) {
            case "+":
                result += String.valueOf(Double.parseDouble(number1) + Double.parseDouble(number2));
                break;
            case "-":
                result += String.valueOf(Double.parseDouble(number1) - Double.parseDouble(number2));
                break;
            case "*":
                result += String.valueOf(Double.parseDouble(number1) * Double.parseDouble(number2));
                break;
            case "/":
                if (!number2.equals("0")) {
                    result += String.valueOf(Double.parseDouble(number1) / Double.parseDouble(number2));
                } else {
                    result += "Error. Divine by 0";
                }
                break;
        }

        req.setAttribute("result", result);
        req.getRequestDispatcher("Calculator.jsp").forward(req, resp);
    }
}
