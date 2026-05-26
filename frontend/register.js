async function register() {

    const user = {

        name: document.getElementById("name").value,

        email: document.getElementById("email").value,

        password: document.getElementById("password").value
    };

    const response = await fetch(
        "http://localhost:8080/api/auth/register",
        {
            method: "POST",

            headers: {
                "Content-Type": "application/json"
            },

            body: JSON.stringify(user)
        }
    );

    const result = await response.text();

    document.getElementById("message").innerText = result;
}