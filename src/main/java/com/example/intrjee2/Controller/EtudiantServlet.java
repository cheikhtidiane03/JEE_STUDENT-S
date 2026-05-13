package com.example.intrjee2.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/etudiant")
public class EtudiantServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nom = "Diop";
        List<String> emails = new ArrayList<>();
        emails.add("diop@gmail.com");
        emails.add("ba@gmail.com");

        req.setAttribute("noms", nom);
        req.setAttribute("emails", emails);
        req.getRequestDispatcher("WEB-INF/list.jsp").forward(req, resp);

    }
}
