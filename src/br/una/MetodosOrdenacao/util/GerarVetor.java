/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.una.MetodosOrdenacao.util;

import java.util.Random;
import static jdk.nashorn.internal.objects.NativeMath.random;

/**
 *
 * @author 31322163
 */
public class GerarVetor {

    private Integer[] vet10 = new Integer[10];
    private Integer[] vet100 = new Integer[100];
    private Integer[] vet1000 = new Integer[1000];
    private Integer[] vet10000 = new Integer[10000];

    public void gerarCrescente() {
        for (int i = 0; i < vet10.length; i++) {
            vet10[i] = i;
        }
        for (int i = 0; i < vet100.length; i++) {
            vet100[i] = i;
        }
        for (int i = 0; i < vet1000.length; i++) {
            vet1000[i] = i;
        }
        for (int i = 0; i < vet10000.length; i++) {
            vet10000[i] = i;
        }
    }

    public void gerarDecrescente() {
        for (int i = vet10.length - 1; i > 0; i--) {
            vet10[i] = vet10.length - i;
        }
        for (int i = vet100.length - 1; i > 0; i--) {
            vet100[i] = vet100.length - i;
        }
        for (int i = vet100.length - 1; i > 0; i--) {
            vet1000[i] = vet1000.length - i;
        }
        for (int i = vet100.length - 1; i > 0; i--) {
            vet10000[i] = vet10000.length - i;
        }
    }
    
    public void gerarAleatorio(){
        Random random = new Random();
        for(int i = 0;i<vet10.length;i++){
        }
    }

}
