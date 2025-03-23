package vcmsa.ci.calculatorapp



import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var num1: EditText
    private lateinit var num2: EditText
    private lateinit var resultText: TextView
    private lateinit var btnAdd: Button
    private lateinit var btnSubtract: Button
    private lateinit var btnMultiply: Button
    private lateinit var btnDivide: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)
        val resultText = findViewById<TextView>(R.id.resultText)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubtract = findViewById<Button>(R.id.btnSubtract)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnCalculate.setOnClickListener {

            val num1Text = num1.text.toString()
            val num2Text = num2.text.toString()



            if (num1Text.isEmpty() || num2Text.isEmpty()) {
                Toast.makeText(this, "Please enter both numbers!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }


            val num1 = num1Text.toDoubleOrNull()
            val num2 = num2Text.toDoubleOrNull()

            if (num1 == null || num2 == null) {
                Toast.makeText(this, "Invalid input! Enter valid numbers.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }


            val sum = num1 + num2



            tvResult.text = "Result: $sum"

            Toast.makeText(this, "✅ The sum is $sum", Toast.LENGTH_LONG).show()
        }
    }




