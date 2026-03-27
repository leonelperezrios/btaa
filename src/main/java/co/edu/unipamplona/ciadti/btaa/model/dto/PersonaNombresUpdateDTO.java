package co.edu.unipamplona.ciadti.btaa.model.dto;

public record PersonaNombresUpdateDTO(
    String primerNombre,
    String segundoNombre,
    String primerApellido,
    String segundoApellido,
    String tipoDocumento,
    String numeroDocumento,
    String fechaExpedicion,
    String sexo
) {
}

