/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicamp.ic.mc322.util;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

public class JMenuFrame {

    // metodo para criar um menu na barra de menu

    // parametros: name(nome do menu), Frm(jframe onde o menu vai ficar)
    // parametros: internal(JintenalFram que vai receber essa tela), painel(tela q
    // sera passada)

    public static JMenu CreateMenuItem(String name, JFrame frame) {
        // instaciando um objeto da classe menu
        JMenu menu = new JMenu();
        JOptionPane.showConfirmDialog(null, "Deu bom1");

        // Passando o nome e mudando a fonte desse menu
        menu.setText(name);
        menu.setFont(new java.awt.Font("Segoe UI", 0, 16));

        // quando o menu for clicado
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frame.setVisible(true);
            }
        });

        // retorna o menu
        return menu;
    }

}
