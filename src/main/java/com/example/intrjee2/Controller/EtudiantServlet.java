package com.example.intrjee2.Controller;

import com.example.intrjee2.Model.Etudiant;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/etudiant/*")
public class EtudiantServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String pathInfo = req.getPathInfo();
        if (pathInfo == null || pathInfo.equals("/")) {
            System.out.println("bonjour : " + req.getPathInfo());

            List<Etudiant> etudiants = new ArrayList<>();

            String nom = "exo";
            req.setAttribute("nom", nom);

            etudiants.add(new Etudiant("Diop", "Diop@gmail.com", 12));
            etudiants.add(new Etudiant("Ba", "Ba@gmail.com", 21));

            req.setAttribute("etudiants", etudiants);

            req.getRequestDispatcher("/WEB-INF/list.jsp").forward(req, resp);
        }else {
            System.out.println("bonjour : " + req.getPathInfo());
            String[] params = req.getPathInfo().split("/");
            if (params[params.length-1].equals("/add") || pathInfo.equals("/add")){
                req.getRequestDispatcher("/WEB-INF/add.jsp").forward(req, resp);
            }else if (params[params.length-1].equals("/edit") || pathInfo.equals("/edit")) {

                req.getRequestDispatcher("/WEB-INF/edit.jsp").forward(req, resp);
            }
        }
    }
}