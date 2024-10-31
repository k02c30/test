package jp.ac.neec.it.k022c0030.healthapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val tv5 = findViewById<TextView>(R.id.textView5)
        //tv5.setOnClickListener()

        //db登録
        //食事内容を記録する際には朝昼夕間食で画面を作り食事内容、0calを入力し登録する
        //内容を編集または削除したい場合は朝昼夕の削除したいいずれかを押しそこからdelete文を実行し削除する
        //表示、追加、削除いずれかにも日付の情報を持たせその日の情報が表示されるようにし過去の情報は基本いじれないようにする
        //データを挿入する際は一度削除する例
        //k022c0030 20241023 朝 ご飯 〇〇cal k022c0030 20241023 朝 味噌汁 〇〇cal はあり得るが
        //k022c0030 20241023 朝 ご飯 〇〇cal k022c0030 20241023 朝 ご飯 〇〇calの状況はありえないためデータを挿入する際には一度削除する
        //val sqlDelete = "DELETE FROM cakeconfig WHERE name = ?" //変数によって値が変わるところは?と記述する
        //朝ボタンを押した際に朝という情報を登録画面に送り登録する際に
        //登録例
        //k022c0030 20241023 朝 ご飯 〇〇cal k022c0030 20241023 朝 米、味噌汁、野菜 〇〇cal
        //朝昼夕で入力画面が必要になるかも？
        //削除は二種類存在し
        //dateでその日を取得しているため表示する際にはwhere句でその日プラス朝などで条件をかけ表示しテキストを削除する必要はなくする
    }
}