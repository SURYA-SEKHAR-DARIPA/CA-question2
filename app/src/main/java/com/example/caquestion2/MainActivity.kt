package com.example.caquestion2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var rg_gender:RadioGroup
    lateinit var rb_male:RadioButton
    lateinit var rb_female:RadioButton

    lateinit var cb_hindi:CheckBox
    lateinit var cb_english:CheckBox

    lateinit var btn_submit:Button
    lateinit var tv_answer:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rg_gender=findViewById(R.id.radio_group)
        rb_male=findViewById(R.id.male)
        rb_female=findViewById(R.id.female)


        cb_hindi=findViewById(R.id.hindi)
        cb_english=findViewById(R.id.english)

        btn_submit=findViewById(R.id.button)
        tv_answer=findViewById(R.id.tv_answer)

        btn_submit.setOnClickListener(View.OnClickListener {
            var result=""
            if(rg_gender.checkedRadioButtonId!=-1){
                result+="Selected gender : "
                if(rb_male.isChecked)
                    result+="male\n"
                else if(rb_female.isChecked)
                    result+="female\n"
            }
            result+="Languages Known : "

            if(cb_english.isChecked)
                result+="English,"
            if(cb_hindi.isChecked)
                result+="Hindi,"

            tv_answer.text=result
        })
    }
}