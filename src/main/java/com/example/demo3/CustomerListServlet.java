package com.example.demo3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "customerList", value = "/list")
public class CustomerListServlet extends HttpServlet {
    List<Customer> customers = new ArrayList<>();
    public void init() {
        customers.add(new Customer("A", "02/06/2005", "BN", "https://www.pngplay.com/wp-content/uploads/12/User-Avatar-Profile-PNG-Free-File-Download.png"));
        customers.add(new Customer("B", "01/01/2006", "HN", "https://www.pngplay.com/wp-content/uploads/12/User-Avatar-Profile-PNG-Free-File-Download.png"));
        customers.add(new Customer("C", "31/12/2007", "TP.HCM", "https://www.pngplay.com/wp-content/uploads/12/User-Avatar-Profile-PNG-Free-File-Download.png"));
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listC", customers);
        req.getRequestDispatcher("CustomerList.jsp").forward(req, resp);
    }
}
