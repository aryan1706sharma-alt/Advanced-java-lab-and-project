<!DOCTYPE html>
<html>

<head>
    <title>Student Login</title>

    <style>
        body {
            font-family: Arial;
            background-color: #f2f2f2;
        }

        .login-box {
            width: 350px;
            margin: 100px auto;
            padding: 30px;
            background: white;
            border-radius: 10px;
            box-shadow: 0 0 10px gray;
        }

        h1 {
            text-align: center;
        }

        input {
            width: 100%;
            padding: 10px;
            margin-top: 8px;
            margin-bottom: 15px;
            box-sizing: border-box;
        }

        button {
            width: 100%;
            padding: 10px;
            background: blue;
            color: white;
            border: none;
            cursor: pointer;
        }

        button:hover {
            background: darkblue;
        }
    </style>
</head>

<body>

    <div class="login-box">

        <h1>Student Login</h1>

        <form action="login" method="post">

            <label>Username</label>
            <input type="text" name="username" placeholder="Enter username" required>

            <label>Password</label>
            <input type="password" name="password" placeholder="Enter password" required>

            <button type="submit">Login</button>

        </form>

    </div>

</body>

</html>