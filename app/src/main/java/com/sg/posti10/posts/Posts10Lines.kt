package com.sg.posti10.posts

import com.sg.posti10.*
import com.sg.posti10.util.DemiPost
import com.sg.posti10.util.Tools

class Posts10Lines {
      val tool= Tools()
      val demi= DemiPost()
       var margin=0

     /*    fun loadPost1000() {
        val post = Post()
        with(post) {
            postNum = 1000
            lineNum = 10
            postId = 85
            imageUri =
                "https://cdn.pixabay.com/photo/2018/02/15/19/42/sunset-3156176_1280.jpghttps://cdn.pixabay.com/photo/2018/02/15/19/42/sunset-3156176_1280.jpg"
            postText = arrayListOf(
                " יש לך טעות בסיסית, ",
                " כדי שהכל יסתדר ",
                " לא צריך שכל העולם יהיה בסדר ",
                " שיהיה שלום עולמי ",
                " ויגמרו כל הרשע הצער והכאב ",
                " ממש לא, ",
                " כדי שהכל יסתדר ",
                "  מספיק שאתה אישית  ",
                " תרגיש בסדר עם עצמך לרגע, ",
                " זה הכול. "
            )
            postTransparency = 5
            postTextSize = arrayListOf(0, 17)
            val backgroundColor = "#00539C"
            val textColor = "#FFD662"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            //        post.textLocation = arrayListOf(102,   -1,       35,            10,               0,        60,         1,            -30)            // locate in the bottom
            //      post.textLocation = arrayListOf(102,  10,       35,            -1,               0,         0,          0,              0)            //locate in the top
            textLocation = arrayListOf(10, -1, 35, 10, 0, 0, 0, 0)
//            textLocation = arrayListOf(10, 10, 35,-1, 0, 0,0, 0)
            postPadding = arrayListOf(0, 0, 0, 0)
            postRadiuas = 16
            lineSpacing = 1.3f
             }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost1001() { //I  //nv
        val post = Post()
        with(post) {
            postNum = 1001
            lineNum = 10
            postId = 85
            imageUri = "https://cdn.pixabay.com/photo/2013/04/23/09/39/costume-106595_1280.jpg"
            postText = arrayListOf(
                " אישה יפה הולכת בחוף, ",
                " הגוף התנועה החצי מבט ",
                " עושים לך את זה, אתה כבר במקום אחר. ",
                " קח את אותה אישה ",
                " שים אותה על שולחן הניתוחים לאופרציה שיגרתית של הוצאת איבר חולה, ",
                " מחריד, היית מתעלף תוך שניה מהמראות. ",
                " מסקנה: ",
                " האדם לא בנוי להתמודד ביומיום שלו עם האמת  זה גדול עליו,  ",
                " הוא מעדיף ווריאציה נוחה של האמת ",
                " ורצוי עם בגד ים מינימלי. "
            )
            textLocation = arrayListOf(10, -1, 23,5, 0, 0,0,0)
            postId = 85
            postTransparency = 8
            postTextSize = arrayListOf(0, 11)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="c5QfXjsoNe4"
            videoText=util1.getVideoText(postNum)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }


  fun loadPost1003() {
        val post = Post()
        with(post) {
            postNum = 1003
            lineNum = 10
            postId = 85
            imageUri = "https://cdn.pixabay.com/photo/2016/05/11/16/32/bridge-1385938_960_720.jpg"
            postText = arrayListOf(
                " הרבי אמר: ",
                " \"העולם כולו גשר צר מאוד והעיקר לא לפחד כלל\" ",
                " ולבריאותך הנפשית אפשר להוסיף: ",
                "יש בעולם גשרים צרים מאוד, ",
                " אבל רצוי לך לדעת ",
                " מתי הגשר מתחיל ",
                " וטוב לך לנהוג שם באומץ וזהירות, ",
                " ומתי הגשר נגמר  ",
                " ואפשר לך לנשום לרווחה ",
                " ולהרפות. "
            )
            textLocation = arrayListOf(10, -1, 23,10, 0,0,0,0)
            postId = 86
            postTransparency = 9
            postTextSize = arrayListOf(0, 11)
            val backgroundColor = "#990011"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

fun loadPost1004() {
    val post = Post()
    with(post) {
        postNum = 1004
        lineNum = 10
        postId = 85
        imageUri = "https://cdn.pixabay.com/photo/2016/03/04/17/51/brick-1236403_960_720.jpg"
        postText = arrayListOf(
            " אני חושב שכבישים ללא מוצא ",
            " לא צריכים להרגיש אשמים ",
            " על זה שאין להם מוצא ",
            " בגלל שככה הם נוצרו, ",
            " ------- ",
            " אני חושב שאנשים ",
            " לא צרכים להרגיש אשמים ",
            " שהם בני אדם ",
            " זה נכון שיש להם מוגבלות אנושית ",
            " אבל ככה הם נוצרו. "
        )
        textLocation = arrayListOf(10, -1, 30,10, 0,0,0,0)
        postId = 86
        postTransparency = 9
        postTextSize = arrayListOf(0, 14)
        val backgroundColor = "#990011"
        val textColor = "#ffffff"
        postFontFamily = 103
        postBackground = util.improveColorString(backgroundColor)
        val textcolo = util.improveColorString(textColor)
        val col = "#$textcolo"
        postTextColor = arrayListOf(CONSTANT, col)
        postPadding = arrayListOf(0, 0, 0, 0)
        videoUrl="93aXrAW0y10"
        videoText = util1.getPostExplanation(postNum, postText)
    }
    drawPost.drawPostFire(post, layout)
    util.sendPostToStringFirestore(post)
}

    fun loadPost1005() {
        val post = Post()
        with(post) {
            postNum = 1005
            lineNum = 10
            postId = 85
            imageUri = "https://cdn.pixabay.com/photo/2016/03/31/17/51/cube-1293954_960_720.png"
            postText = arrayListOf(
                " בחיים האלה ",
                " כל סוף הוא התחלה ",
                " וכל התחלה היא סוף, ",
                " בכל אור יש צל ",
                " ובכל צל יש אור, ",
                " בכל אמת יש כזב ",
                " ובכל כזב יש אמת, ",
                " אין בעיה עם כל זה ",
                " רק שזה יכול לבלבל ",
                " אנשים שמחפשים סדר בחיים. "
            )
            textLocation = arrayListOf(10, -1, 30,10, 0,0,0,0)
            postId = 86
            postTransparency = 9
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="quCa39ZbwMs"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }

    fun loadPost1006() {
        val post = Post()
        with(post) {
            postNum = 1006
            lineNum = 10
            postId = 85
            imageUri = "https://cdn.pixabay.com/photo/2020/01/20/22/21/palace-4781577_960_720.jpg"

            postText = arrayListOf(
                " החיים שלך ",
                " זה איך שאתה תופס אותם, ",
                " אתה תופס אותם כטוב ",
                " אתה חי בטוב, ",
                " אתה תופס אותם כרע  ",
                " אתה חי ברע, ",
                " כך שאם אתה שואל: ",
                " מי זה האלוהים הזה ",
                " שקובע לי איך החיים שלי יהיו ? ",
                " זהו, שזה אתה. "
            )
            textLocation = arrayListOf(10, -1, 30,10, 0,0,0,0)
            postId = 86
            postTransparency =5
            postTextSize = arrayListOf(0, 14)
            val backgroundColor = "#000000"
            val textColor = "#ffffff"
            postFontFamily = 103
            postBackground = util.improveColorString(backgroundColor)
            val textcolo = util.improveColorString(textColor)
            val col = "#$textcolo"
            postTextColor = arrayListOf(CONSTANT, col)
            postPadding = arrayListOf(0, 0, 0, 0)
            videoUrl="tyy-XIbfxOk"
            videoText = util1.getPostExplanation(postNum, postText)
        }
        drawPost.drawPostFire(post, layout)
        util.sendPostToStringFirestore(post)
    }*/

      fun loadPost1006(): Post {
        var post = Post()
        with(post) {
            imageUri = "https://cdn.pixabay.com/photo/2020/01/20/22/21/palace-4781577_960_720.jpg"
            postText = arrayListOf(
                " החיים שלך ",
                " זה איך שאתה תופס אותם, ",
                " אתה תופס אותם כטוב ",
                " אתה חי בטוב, ",
                " אתה תופס אותם כרע  ",
                " אתה חי ברע, ",
                " כך שאם אתה שואל: ",
                " מי זה האלוהים הזה ",
                " שקובע לי איך החיים שלי יהיו ? ",
                " זהו, שזה אתה. "
            )
            postTransparency =8
            postTextSize = arrayListOf(0,14)
            margin=0
            val colorIndex=45
            val selector=2
            val fontFamily=103
            postNum= tool.extractPostNumFromFunctionName()
            post=demi.demiPost100(postNum,imageUri,postText,postTransparency,postTextSize,margin,colorIndex,selector,fontFamily)

        }
        return post
    }





 }