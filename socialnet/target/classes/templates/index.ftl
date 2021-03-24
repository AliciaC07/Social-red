<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<table>
    <thead>
        <tr>
            <th>Id</th>
            <th>Nombre de Usuario</th>
            <th>Nombre Persona</th>
            <th>Apellido Persona</th>
        </tr>
    </thead>
    <tbody>
        <#list listaUsuarios as usuario>
            <tr>
                <td>${usuario.id}</td>
                <td>${usuario.nombreUsuario}</td>
                <td>${usuario.nombre}</td>
                <td>${usuario.apellido}</td>
            </tr>
        </#list>
    </tbody>
</table>
</body>
</html>