package pitam.recyclertable

import android.graphics.Color
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import pitam.recyclertable.databinding.ItemRowBinding

class RecyclerTableAdapter(
    var items: MutableList<List<String>> = mutableListOf()
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
            hideAllTextViews()
            val isFirstItem = position == 0
            with(binding) {
                if (isFirstItem) {
                    root.setBackgroundColor(Color.parseColor("#9CE1FF"))
                }
                items[position].forEachIndexed { index, it ->
                    when (index) {
                        0 -> textView0.setWidthAndText(it, isFirstItem)
                        1 -> textView1.setWidthAndText(it, isFirstItem)
                        2 -> textView2.setWidthAndText(it, isFirstItem)
                        3 -> textView3.setWidthAndText(it, isFirstItem)
                        4 -> textView4.setWidthAndText(it, isFirstItem)
                        5 -> textView5.setWidthAndText(it, isFirstItem)
                        6 -> textView6.setWidthAndText(it, isFirstItem)
                        7 -> textView7.setWidthAndText(it, isFirstItem)
                        8 -> textView8.setWidthAndText(it, isFirstItem)
                        9 -> textView9.setWidthAndText(it, isFirstItem)
                        10 -> textView10.setWidthAndText(it, isFirstItem)
                        11 -> textView11.setWidthAndText(it, isFirstItem)
                        12 -> textView12.setWidthAndText(it, isFirstItem)
                        13 -> textView13.setWidthAndText(it, isFirstItem)
                        14 -> textView14.setWidthAndText(it, isFirstItem)
                        15 -> textView15.setWidthAndText(it, isFirstItem)
                        16 -> textView16.setWidthAndText(it, isFirstItem)
                        17 -> textView17.setWidthAndText(it, isFirstItem)
                        18 -> textView18.setWidthAndText(it, isFirstItem)
                    }
                }

            }

        }

        private fun TextView.setWidthAndText(text: String, bold: Boolean) {
            visibility = View.VISIBLE
            //layoutParams = LinearLayout.LayoutParams(it, LinearLayout.LayoutParams.WRAP_CONTENT)
            this.text = text
            if (bold) {
                setTypeface(null, Typeface.BOLD)
            }
        }

        private fun hideAllTextViews() {
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
            }

        }

    }
}