package clpstudio.com.kotlinplayground.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import clpstudio.com.kotlinplayground.R
import clpstudio.com.kotlinplayground.repository.NumbersRepository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: ListAdapter
    private val numbersRepository: NumbersRepository = NumbersRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Setup the list
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = ListAdapter()
        recyclerView.adapter = adapter

        //Fetch data and update the list rows
        adapter.addAll(numbersRepository.getNumbers())
    }

}


