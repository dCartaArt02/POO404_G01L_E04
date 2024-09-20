<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<form id="loginForm">
  <label for="email">Email</label>
  <input type="email" id="email" name="email" required>

  <label for="password">Contraseña</label>
  <input type="password" id="password" name="password" required>

  <button type="submit">Iniciar sesión</button>
</form>

<script>
  document.getElementById('loginForm').addEventListener('submit', async function(event) {
    event.preventDefault();

    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    const response = await fetch('/login', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({ email, password })
    });

    if (response.ok) {
      const data = await response.text();
      alert(data); // Dependiendo del rol, se redirige a la página adecuada
    } else {
      alert('Credenciales incorrectas');
    }
  });
</script>

</body>
</html>