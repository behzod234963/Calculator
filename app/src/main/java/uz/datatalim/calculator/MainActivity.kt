package uz.datatalim.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity : AppCompatActivity(),OnClickListener {
    lateinit var tvStatus:TextView
    lateinit var bAC:Button
    lateinit var ibClear:ImageButton
    lateinit var bPercent:Button
    lateinit var bDevide:Button
    lateinit var bNum7:Button
    lateinit var bNum8:Button
    lateinit var bNum9:Button
    lateinit var bNum4:Button
    lateinit var bNum5:Button
    lateinit var bNum6:Button
    lateinit var bNum1:Button
    lateinit var bNum2:Button
    lateinit var bNum3:Button
    lateinit var bNum0:Button
    lateinit var bMultiply:Button
    lateinit var bMinus:Button
    lateinit var bPlus:Button
    lateinit var bEquals:Button
    lateinit var  bDot:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

     fun initViews(){

         tvStatus=findViewById<TextView>(R.id.tv_status)
         bAC=findViewById<Button>(R.id.b_ac)
         ibClear=findViewById(R.id.ib_clear)
         bPercent=findViewById<Button>(R.id.b_percent)
         bDevide=findViewById<Button>(R.id.b_devide)
         bNum7=findViewById<Button>(R.id.b_num7)
         bNum8=findViewById<Button>(R.id.b_num8)
         bNum9=findViewById<Button>(R.id.b_num9)
         bNum4=findViewById<Button>(R.id.b_num4)
         bNum5=findViewById<Button>(R.id.b_num5)
         bNum6=findViewById<Button>(R.id.b_num6)
         bNum1=findViewById<Button>(R.id.b_num1)
         bNum2=findViewById<Button>(R.id.b_num2)
         bNum3=findViewById<Button>(R.id.b_num3)
         bNum0=findViewById(R.id.b_num0)
         bMultiply=findViewById<Button>(R.id.b_multiply)
         bMinus=findViewById<Button>(R.id.b_minus)
         bPlus=findViewById<Button>(R.id.b_plus)
         bEquals=findViewById<Button>(R.id.b_equals)
         bDot=findViewById<Button>(R.id.b_dot)

         tvStatus.setOnClickListener(this)
         bAC.setOnClickListener(this)
         ibClear.setOnClickListener(this)
         bPercent.setOnClickListener(this)
         bDevide.setOnClickListener(this)
         bMultiply.setOnClickListener(this)
         bMinus.setOnClickListener(this)
         bPlus.setOnClickListener(this)
         bEquals.setOnClickListener(this)
         bDot.setOnClickListener(this)
         bNum0.setOnClickListener(this)
         bNum1.setOnClickListener(this)
         bNum2.setOnClickListener(this)
         bNum3.setOnClickListener(this)
         bNum4.setOnClickListener(this)
         bNum5.setOnClickListener(this)
         bNum6.setOnClickListener(this)
         bNum7.setOnClickListener(this)
         bNum8.setOnClickListener(this)
         bNum9.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        var res=0

        when(v?.id){

            R.id.b_num1->{

                if (tvStatus.text=="0"){

                    tvStatus.text="1"

                }else{

                    tvStatus.text="${tvStatus.text}1"

                }

            }
            R.id.b_num2->{

                if (tvStatus.text=="0"){

                    tvStatus.text="2"

                }else{

                    tvStatus.text="${tvStatus.text}2"

                }

            }
            R.id.b_num3->{

                if (tvStatus.text=="0"){

                    tvStatus.text="3"

                }else{

                    tvStatus.text="${tvStatus.text}3"

                }

            }
            R.id.b_num4->{

                if (tvStatus.text=="0"){

                    tvStatus.text="4"

                }else{

                    tvStatus.text="${tvStatus.text}4"

                }

            }
            R.id.b_num5->{

                if (tvStatus.text=="0"){

                    tvStatus.text="5"

                }else{

                    tvStatus.text="${tvStatus.text}5"

                }

            }
            R.id.b_num6->{

                if (tvStatus.text=="0"){

                    tvStatus.text="6"

                }else{

                    tvStatus.text="${tvStatus.text}6"

                }

            }
            R.id.b_num7->{

                if (tvStatus.text=="0"){

                    tvStatus.text="7"

                }else{

                    tvStatus.text="${tvStatus.text}7"

                }

            }
            R.id.b_num8->{

                if (tvStatus.text=="0"){

                    tvStatus.text="8"

                }else{

                    tvStatus.text="${tvStatus.text}8"

                }

            }
            R.id.b_num9->{

                if (tvStatus.text=="0"){

                    tvStatus.text="9"

                }else{

                    tvStatus.text="${tvStatus.text}9"

                }

            }
            R.id.b_num0->{

                if (tvStatus.text=="0"){

                    tvStatus.text="0"

                }else{

                    tvStatus.text="${tvStatus.text}0"

                }

            }
            R.id.b_ac->{

                tvStatus.text="0"

            }
            R.id.ib_clear->{

                var str=tvStatus.text.toString()
                if (str.isNotEmpty()){

                    tvStatus.text=str.substring(0,str.length-1)

                }

            }
            R.id.b_equals->{

                try {

                    val ex= ExpressionBuilder(tvStatus.text.toString()).build()
                    val result=ex.evaluate()
                    val resLong=result.toLong()
                    if (result==resLong.toDouble()){

                        tvStatus.text=resLong.toString()

                    }else{

                        tvStatus.text=result.toString()

                    }
                }catch (e:Exception){
                }

            }
            R.id.b_percent->{

                if(tvStatus.text.isNotEmpty()){

                    if (tvStatus.text.last().isDigit()){

                        tvStatus.text="${tvStatus.text}%"

                    }else{

                        tvStatus.text=""

                    }

                }

            }
            R.id.b_devide->{

                if (tvStatus.text.isNotEmpty()){

                    if (tvStatus.text.last().isDigit()){

                        tvStatus.text="${tvStatus.text}/"

                    }else{

                        tvStatus.text=""

                    }

                }

            }
            R.id.b_multiply->{

                if (tvStatus.text.isNotEmpty()){

                    if (tvStatus.text.last().isDigit()){

                        tvStatus.text="${tvStatus.text}*"

                    }else{

                        tvStatus.text=""

                    }

                }

            }
            R.id.b_minus->{

                if(tvStatus.text.isNotEmpty()){
                    if (tvStatus.text.last().isDigit()){

                        tvStatus.text="${tvStatus.text}-"

                    }else{

                        tvStatus.text=""

                    }
                }

            }
            R.id.b_plus->{

                if (tvStatus.text.isNotEmpty()){
                    if (tvStatus.text.last().isDigit()){

                        tvStatus.text="${tvStatus.text}+"

                    }else{

                        tvStatus.text=""

                    }
                }

            }
            R.id.b_dot->{

                if (tvStatus.text.isNotEmpty()){
                    if (tvStatus.text.last().isDigit()){

                        tvStatus.text="${tvStatus.text}."

                    }else{

                        tvStatus.text=""

                    }
                }

            }

        }

    }

}