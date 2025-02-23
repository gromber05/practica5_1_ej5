

fun main() {
    val libro1 = Libro("Kotlin para principiantes", "Juan Pérez", 2022)
    val revista1 = Revista("Ciencia Hoy", 45, 2023)
    val dvd1 = DVD("Interstellar", "Christopher Nolan", 2014)

    val estudiante = Usuario.Estudiante("E123", "Carlos", "Informática")
    val profesor = Usuario.Profesor("P456", "María", "Matemáticas")
    val visitante = Usuario.Visitante("V789", "Luis")

    println(tomarPrestado(estudiante, libro1))
    println(tomarPrestado(profesor, libro1))
    println(tomarPrestado(visitante, libro1))
}

fun tomarPrestado(usuario: Usuario, libro: Libro): String {
    return when (usuario) {
        is Usuario.Visitante -> "${usuario.nombre} no puede tomar prestado el libro ${libro.titulo}."
        is Usuario.Profesor -> "${usuario.nombre} puede tomar prestado el libro ${libro.titulo} por un largo periodo."
        is Usuario.Estudiante -> "${usuario.nombre} puede tomar prestado el libro ${libro.titulo}."
    }
}