/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Arjeware.Arjeware.presentacion.metodos.arje;

import co.com.Arjeware.Arjeware.presentacion.metodos.utilidades.Colores;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

/**
 *
 * @author Sebas
 */
public class JTextFieldHint extends JTextField implements FocusListener{
    private final Font fontLost = new Font("Microsoft New Tai Lue", Font.BOLD, 17);
    private final Font fontGained = new Font("Microsoft New Tai Lue", Font.BOLD, 18);
    private final Color colorLost = Color.LIGHT_GRAY;
    private final Color colorGained = Color.BLACK;
    private String hint;
 
    @SuppressWarnings("LeakingThisInConstructor")
    public JTextFieldHint() {
        addFocusListener(this);
        this.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Colores.color_verdeClaro));
    }
 
    public void setHint(String hint) {
        setForeground(colorLost);
        setFont(fontLost);
        setText(hint);
        this.hint = hint;
        this.setOpaque(false);
    }
 
    public String getHint() {
        return hint;
    }
 
    @Override
    public void focusGained(FocusEvent e) {
        if (getText().equals(getHint())) {
            setText("");
            setFont(fontGained);
            setForeground(colorGained);
            setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Colores.color_verdeClaro));
        } else {
            setForeground(colorGained);
            setFont(fontGained);
            setText(getText());
        }
    }
 
    @Override
    public void focusLost(FocusEvent e) {
        if (getText().length() <= 0) {
            setHint(getHint());
            setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Colores.color_verdeClaro));
        } else {
            setForeground(colorGained);
            setFont(fontGained);
            setText(getText());
        }
    }
}
