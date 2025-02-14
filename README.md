**Ejercicio 5: Sistema de Gestión de Biblioteca**

Imagina que estás construyendo un sistema para una biblioteca que gestiona libros y usuarios. Este sistema deberá poder manejar distintos tipos de ítems en la biblioteca (libros, revistas, DVDs) y distintos tipos de usuarios (estudiante, profesor, visitante).

### **Parte 1: Definir data class**
- **Libro**: Título (*String*), Autor (*String*) y Año de Publicación (*Int*).
- **Revista**: Título (*String*), Issue (*Int*), Año (*Int*).
- **DVD**: Título (*String*), Director (*String*), Año (*Int*).

Estas clases almacenarán la información básica de cada ítem en la biblioteca. Usa *data class* para definirlas, ya que son perfectas para almacenar datos sin necesidad de lógica adicional.

### **Parte 2: Definir sealed class**
Para gestionar los distintos tipos de usuarios, usa una *sealed class*, lo que permitirá una jerarquía cerrada de clases.

- **Usuario** (sealed class)
    - **Estudiante**(id: *String*, nombre: *String*, carrera: *String*)
    - **Profesor**(id: *String*, nombre: *String*, departamento: *String*)
    - **Visitante**(id: *String*, nombre: *String*)

La *sealed class* **Usuario** permitirá manejar operaciones específicas para cada tipo de usuario, como préstamos de libros o acceso a áreas restringidas de la biblioteca.

### **Ejercicio Propuesto**
1. Definir las *data class* para **Libro, Revista y DVD**.
2. Crear una *sealed class* **Usuario** con las subclases **Estudiante, Profesor y Visitante**, cada una con sus respectivas propiedades.
3. Implementar una función que acepte un **Usuario** y un **Libro**, y devuelva un mensaje indicando si el usuario puede o no tomar prestado el libro.
    - Los **Visitantes** no pueden tomar prestados libros.
    - Los **Profesores** pueden tener préstamos por más tiempo que los **Estudiantes**.
