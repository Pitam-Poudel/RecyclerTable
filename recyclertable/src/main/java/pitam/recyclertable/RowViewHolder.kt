package pitam.recyclertable

import android.graphics.Color
import android.graphics.Typeface
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pitam.recyclertable.databinding.ItemRowBinding

class RowViewHolder(var binding: ItemRowBinding) : RecyclerView.ViewHolder(binding.root) {
    private val textViews = with(binding) {
        listOf(
            textView0, textView1, textView2, textView3, textView4, textView5, textView6,
            textView7, textView8, textView9, textView10, textView11, textView12, textView13,
            textView14, textView15, textView16, textView17, textView18, textView19, textView20,
            textView21, textView22, textView23, textView24, textView25, textView26, textView27,
            textView28, textView29, textView30, textView31, textView32, textView33, textView34,
            textView35, textView36
        )
    }

    private fun hideAllTextViews() {
        textViews.forEach {
            it.visibility = View.GONE
        }

    }

    private fun TextView.showText(text: String, bold: Boolean) {
        visibility = View.VISIBLE
        this.text = text
        if (bold) {
            setTypeface(null, Typeface.BOLD)
        }
    }


    fun bind(data: List<String>, isHeader: Boolean=false) {
        hideAllTextViews()
        with(binding) {
            if (isHeader) {
                root.setBackgroundColor(Color.parseColor("#9CE1FF"))
            }
            data.forEachIndexed { index, s ->
                if (index < textViews.size) {
                    textViews[index].showText(s, isHeader)
                }

            }

        }
    }

    fun setCellWidths(widths: List<Int>) {
        widths.forEachIndexed { index, width ->
            textViews[index].layoutParams =
                LinearLayout.LayoutParams(width, LinearLayout.LayoutParams.WRAP_CONTENT)

        }
    }

}