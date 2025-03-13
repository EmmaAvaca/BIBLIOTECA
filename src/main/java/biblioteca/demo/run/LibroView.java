package biblioteca.demo.run;

import javax.swing.*;
import java.awt.*;

public class LibroView extends JFrame {
    public LibroView() {
        setTitle("Gestión de Libros");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Lista de Libros", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(titleLabel, BorderLayout.NORTH);

        JTextArea libroTextArea = new JTextArea();
        libroTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(libroTextArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        JButton agregarButton = new JButton("Agregar Libro");
        JButton eliminarButton = new JButton("Eliminar Libro");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(agregarButton);
        buttonPanel.add(eliminarButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }
}