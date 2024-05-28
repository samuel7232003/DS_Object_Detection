<%@ page import="ModelBean.Vocab" %>
<%@ page import="ModelDATA.VocabDATA" %>
<%@ page import="Socket.SocketController" %><%--
  Created by IntelliJ IDEA.
  User: Le Viet Thanh
  Date: 5/27/2024
  Time: 9:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Trang chủ - Công cụ hộ trợ học từ vựng Tiếng Anh</title>
    <link rel="stylesheet" href="../Style/Home.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Be+Vietnam+Pro:wght@300;400;700&family=Bodoni+Moda:ital,wght@0,400;0,500;0,600;0,700;0,800;1,400;1,500;1,600;1,700;1,800&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;1,100;1,200;1,300;1,400;1,500;1,600;1,700&display=swap" rel="stylesheet">
    <script src="https://kit.fontawesome.com/5175756225.js" crossorigin="anonymous"></script>
</head>
<body>
<div class="header">
    <div class="header-buttons">
        <div class="home">
            <i class="fa-solid fa-house"></i>
            <img src="" alt="">
            <a href="">Trang chủ</a>
        </div>
    </div>
    <div class="header-logout">
        <a href="Login.jsp">Trở lại</a>
    </div>
</div>
<div class="main">
    <%
        SocketController socketController = new SocketController();
        socketController.openSocket();
    %>
    <div class="main-top">
        <div class="stream"></div>
        <div class="detail">
            <i class="fa-solid fa-volume-high volume"></i>
            <p id="a" class="detail-word">Mobile phone</p>
            <p id="b" class="detail-sys">/ˌmōb(ə)l ˈfōn/</p>
            <div class="detail-item">
                <p class="detail-title">
                    <i class="fa-regular fa-lightbulb"></i>
                    Nghĩa:
                </p>
                <span class="detail-line"></span>
                <p id="c" class="detail-content">Điện thoại di động</p>
            </div>
            <div class="detail-item">
                <p class="detail-title">
                    <i class="fa-solid fa-quote-left"></i>
                    Cách dùng:
                </p>
                <span class="detail-line"></span>
                <p id="d" class="detail-content">My mobile phone was broke the screen.</p>
            </div>
            <div class="detail-item">
                <p class="detail-title">
                    <i class="fa-solid fa-image"></i>
                    Hình ảnh minh họa:
                </p>
                <span class="detail-line"></span>
                <img id="img" src="../Image/image 4.png" alt="">
            </div>
        </div>
    </div>
    <div class="main-botton">
        <%
            for(int i = 0; i < 3; i++){
                Vocab vocab = new Vocab();
                vocab = VocabDATA.getInstance().getAllVocab().get(i);
        %>
        <div onmouseover="show('<%=vocab.getWord()%>','<%=vocab.getSys()%>',' <%=vocab.getMean()%>', '<%=vocab.getExample()%>', '<%=vocab.getIdVocab()%>')" class="item">
            <p class="item-word"><%=vocab.getWord()%></p>
            <p class="item-sys"><%=vocab.getSys()%></p>
            <p class="item-mean"><%=vocab.getMean()%></p>
            <i class="fa-solid fa-volume-high"></i>
        </div>
        <%}%>;
    </div>
</div>
<script type="text/javascript">
    function show( a, b, c, d, e){
        word = document.getElementById('a');
        word.innerText = a;
        sys = document.getElementById('b');
        sys.innerText = b;
        mean = document.getElementById('c');
        mean.innerText = c;
        example = document.getElementById('d');
        example.innerText = d;
        img = document.getElementById('img');
        img.src = "../Image/"+ e + ".jpg"
        console.log(img)
    }
</script>
</body>
</html>
