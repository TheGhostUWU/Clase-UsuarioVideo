/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.youtube;

/**
 *
 * @author 97114
 */
public class Youtube {

    public static void main(String[] args) {
        Usuario Usuario= new Usuario ("TheGhost:");
        Video Video= new Video("aprendiendo java",2400,"http;//TheGhost.com");
        Usuario.subirVideo(Video);
        Usuario.mostrarInfoUsuario();
    }
}
