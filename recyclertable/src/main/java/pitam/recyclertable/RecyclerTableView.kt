package pitam.recyclertable

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import pitam.recyclertable.databinding.ItemRowBinding
import pitam.recyclertable.databinding.LayoutRecyclerTableBinding

open class RecyclerTableView(context: Context, attrs: AttributeSet?) :
    LinearLayout(context, attrs)
    //HorizontalScrollView.IHScrollListener
{
    private lateinit var binding: LayoutRecyclerTableBinding
    private var rvAdapter: RecyclerTableAdapter = RecyclerTableAdapter()

    init {
        loadUi(context)
    }

    private fun loadUi(context: Context) {
        binding = DataBindingUtil.inflate(
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater,
            R.layout.layout_recycler_table,
            this,
            true
        )
        binding.recyclerView.adapter = rvAdapter

//        binding.osv.setScrollViewListener(object : HorizontalScrollView.IHScrollListener{
//            override fun onScrollChanged(
//                scrollView: HorizontalScrollView?,
//                x: Int,
//                y: Int,
//                oldx: Int,
//                oldy: Int
//            ) {
//                binding.osv.scrollTo(x, y)
//            }
//
//        })

    }

    fun setItems(data: List<List<Pair<Int?, String>>>) {
        rvAdapter.items.clear()
        rvAdapter.items.addAll(data)
        rvAdapter.notifyDataSetChanged()
    }

    inner class RecyclerTableAdapter(
        var items: MutableList<List<Pair<Int?, String>>> = mutableListOf()
    ) : RecyclerView.Adapter<RecyclerTableAdapter.VH>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
            val binding: ItemRowBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_row,
                parent,
                false
            )
            return VH(binding)
        }

        override fun getItemCount(): Int = items.size

        override fun onBindViewHolder(holder: VH, position: Int) {
            holder.bind(position)
        }

        inner class VH(var binding: ItemRowBinding) : RecyclerView.ViewHolder(binding.root) {
            fun bind(position: Int) {
                val currentItem = items[position]
                val isHeader = position == 0
                with(binding) {
                    textView0.visibility = View.GONE
                    textView1.visibility = View.GONE
                    textView2.visibility = View.GONE
                    textView3.visibility = View.GONE
                    textView4.visibility = View.GONE
                    textView5.visibility = View.GONE
                    textView6.visibility = View.GONE
                    textView7.visibility = View.GONE
                    textView8.visibility = View.GONE
                    textView9.visibility = View.GONE
                    textView10.visibility = View.GONE
                    textView11.visibility = View.GONE
                    textView12.visibility = View.GONE
                    textView13.visibility = View.GONE
                    textView14.visibility = View.GONE
                    textView15.visibility = View.GONE
                    textView16.visibility = View.GONE
                    textView17.visibility = View.GONE
                    textView18.visibility = View.GONE


                    if (isHeader) {
                        root.setBackgroundColor(Color.parseColor("#9CE1FF"))
                    }
                    currentItem.forEachIndexed { index, it ->
                        when (index) {
                            0 -> textView0.setWidthAndText(it, isHeader)
                            1 -> textView1.setWidthAndText(it, isHeader)
                            2 -> textView2.setWidthAndText(it, isHeader)
                            3 -> textView3.setWidthAndText(it, isHeader)
                            4 -> textView4.setWidthAndText(it, isHeader)
                            5 -> textView5.setWidthAndText(it, isHeader)
                            6 -> textView6.setWidthAndText(it, isHeader)
                            7 -> textView7.setWidthAndText(it, isHeader)
                            8 -> textView8.setWidthAndText(it, isHeader)
                            9 -> textView9.setWidthAndText(it, isHeader)
                            10 -> textView10.setWidthAndText(it, isHeader)
                            11 -> textView11.setWidthAndText(it, isHeader)
                            12 -> textView12.setWidthAndText(it, isHeader)
                            13 -> textView13.setWidthAndText(it, isHeader)
                            14 -> textView14.setWidthAndText(it, isHeader)
                            15 -> textView15.setWidthAndText(it, isHeader)
                            16 -> textView16.setWidthAndText(it, isHeader)
                            17 -> textView17.setWidthAndText(it, isHeader)
                            18 -> textView18.setWidthAndText(it, isHeader)
                        }
                    }

                }

            }

            private fun TextView.setWidthAndText(data: Pair<Int?, String>, bold: Boolean) {
                visibility = View.VISIBLE
                data.first?.let { layoutParams = LayoutParams(it, LayoutParams.WRAP_CONTENT) }
                text = data.second
                if (bold) {
                    setTypeface(null, Typeface.BOLD)
                }
            }

        }
    }
}