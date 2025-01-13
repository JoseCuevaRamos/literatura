package com.alura.literatura.service;

public interface IconvierteDatos {
    <T> T obtenerDatos(String json, Class <T> clase);
}
