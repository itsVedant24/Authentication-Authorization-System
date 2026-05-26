async function login() {

    const user = {

        email: document.getElementById("email").value,

        password: document.getElementById("password").value
    };

    const response = await fetch(
        "http://localhost:8080/api/auth/login",
        {
            method: "POST",

            headers: {
                "Content-Type": "application/json"
            },

            body: JSON.stringify(user)
        }
    );

    const token = await response.text();

    localStorage.setItem("token", token);

    document.getElementById("message")
        .innerText = "Login Successful";
}