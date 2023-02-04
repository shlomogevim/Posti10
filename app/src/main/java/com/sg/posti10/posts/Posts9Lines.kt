package com.sg.posti10.posts

import com.sg.posti10.*

class Posts9Lines {
      val tool=Tools()
      val demi=DemiPost()
       var margin=0

    /* fun loadPost900() {
        val post = Post()
        with(post) {
            postNum = 900
            lineNum = 9
            postId=70
            imageUri = "https://cdn.pixabay.com/photo/2013/04/07/21/29/hotel-hall-101634_1280.jpg"
            postText = arrayListOf(
                "לפעמים החיים מרגישים לך כמו מסדרון",
                " של מחשבות תחושות וחוסר משמעות,  ",
                " אתה יודע שאם לא תהיה בתנועה ",
                " תהיה תקוע במסדרון הזה כל היום, ",
                " הכוזבים מכחישים שיש בכלל מסדרון ",
                " הדיכאוניים מכחישים שאפשר ללכת ",
                " הפסימיים לא מאמינים שיש סוף לזה ",
                "רודפי הנחמה  גוררים רגלים, ",
                "  אבל תמיד בסוף המסדרון יש חדר גדול.  "
            )
            postTransparency =8
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#1E4174"
            val textColor = "#DDA94B"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            //        post.textLocation = arrayListOf(102,   -1,       35,            10,               0,        60,         1,            -30)            // locate in the bottom
            //      post.textLocation = arrayListOf(102,  10,       35,            -1,               0,         0,          0,              0)            //locate in the top
            /* textLocation = arrayListOf(10, -1, 35,10, 0, 0,0, 0)
//            textLocation = arrayListOf(10, 10, 35,-1, 0, 0,0, 0)*/

            textLocation = arrayListOf(10, -1, 30,10, 0, 0,0, 0)
//            textLocation = arrayListOf(10, 10, 30,-1, 0, 0,0, 0)
            postPadding =  arrayListOf(5, 0,5, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
        }
        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, TRUE).apply()
//        pref.edit().putString(SHARPREF_MOVING_BACKGROUND, FALSE).apply()
        drawPost.drawPostFire(post,layout)
//        util.sendPostToStringFirestore(post)
        util.sendPostToStringFirestoreWithoutChangingTimeStamp(post)
    }



    fun loadPost901() {      //nv
        val post = Post()
        with(post) {
            postNum = 901
            postId = 85
            lineNum =9
            imageUri = "https://cdn.pixabay.com/photo/2016/04/02/17/58/service-1303313_1280.jpg"
            postText = arrayListOf(
                " שאתה הולך למסעדה ",
                " מה שמעניין אותך יותר ",
                " שהאוכל יהיה טעים ",
                " פחות מה קורה במטבח, ",
                "ובדומה לזה",
                " מה שאתה יוצר ",
                " זה מה שמעניין, ",
                "התחשבנויות האישיות שלך",
                " זה מה שקורה במטבח."
            )

            postId = 86
            textLocation = arrayListOf(10, -1, 30,5, 0, 0, 0, 0)
            postPadding = arrayListOf(10, 0, 10, 0)
            postTransparency =6
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="sxBUFPp9YQY"
            videoText=util1.getVideoText(postNum)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }



    fun loadPost902() {           // esist allready in 905
        val post = Post()

fun loadPost903() {  //I
    val post = Post()
    with(post) {
        postNum = 903
        postId = 85
        lineNum =9
        imageUri = "https://cdn.pixabay.com/photo/2016/07/25/06/29/frog-1539992_960_720.jpg"
        postText = arrayListOf(
            " על הבוקר ",
            " קל להיכנס לביצה היומיומית, ",
            " יש רצון אמיתי לחזור לשם ",
            " (\"כי מן הביצה הגעת ואל הביצה תשוב\"), ",
            "הדרכים לשם רחבות מרופדות ומוארות",
            " בשלל גוונים והצדקות. ",
            " רק אותו חוסר נחת שולי להיות שם ",
            "עם כל הסחי הצפרדעים והנרקיסים",
            " מונע ממך לרוץ חופשי לביצה הזו."
        )
        postId = 86
        textLocation = arrayListOf(10, -1, 25,125, 0, 0, 0, 0)
        postPadding = arrayListOf(5, 0, 5, 0)
        postTransparency =6
        postTextSize = arrayListOf(0, 13)
        val backgroundColor = "#000000"
        val textColor = "#ffffff"
        postFontFamily = 103
        postBackground = util.improveColorString(backgroundColor)
        val textcolo = util.improveColorString(textColor)
        val col = "#$textcolo"
        postTextColor = arrayListOf(CONSTANT, col)
    }
    drawPost.drawPostFire(post, layout)
    util.sendPostToStringFirestore(post)
}

    fun loadPost904() {  //I
        val post = Post()
        with(post) {
            postNum = 904
            postId = 85
            lineNum =9
            imageUri = "https://cdn.pixabay.com/photo/2017/03/23/20/57/girl-2169467_960_720.jpg"
            postText = arrayListOf(
                " זה הכל ענין של מיקוד התמונה, ",
                " בעולם החיצוני ",
                " אתה הוא כזה ",
                " העולם הוא כזה ",
                " הפגישה שלכם ברגע זה מדויקת, ",
                " אבל אצלך בפנים ",
                " אתה לא בדיוק אתה ",
                " העולם לא בדיוק העולם ",
                " והפגישה שלכם ברגע זה לא בדיוק פגישה. "
            )
            postId = 86
            textLocation = arrayListOf(10, -1, 32,0, 7, 30, 0, 0)
            postPadding = arrayListOf(5, 5, 5, 0)
            postTransparency =10
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#F9EBDE"
            val textColor = "#815854"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            videoUrl="sc21E5BTHmk"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }
}*/

      fun loadPost905(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2012/03/01/01/45/baby-20374_1280.jpg"
            postText = arrayListOf(
                "   לדעתי בזמן הלידה ",
                " יש ברדק גדול בשמי מרום, ",
                " והרבה תינוקות לא מקבלים ",
                " את החיים שלהם בצורה מסודרת, ",
                " התינוקות האלה גדלים ",
                " ונעשים לאנשים בוגרים ",
                " שאומנם מתפקדים בסדר גמור, ",
                " אבל נראה שהחיים שלהם נשארו ",
                " אי שם במחסני מרום. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=78
            val selector=1
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)
        }
        return post
    }





 }