package pitam.recyclertable

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import pitam.recyclertable.databinding.ItemRowBinding

class RecyclerTableAdapter(
    private val data: MutableList<List<String>> = mutableListOf(),
    private var cellWidths: List<Int> = mutableListOf()
) : RecyclerView.Adapter<RowViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowViewHolder {
        val binding: ItemRowBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_row,
            parent,
            false
        )
        return RowViewHolder(binding)
    }

    fun setData(list: List<List<String>>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()
    }

    @JvmName("setCellWidths1")
    fun setCellWidths(list: List<Int>) {
        cellWidths = list
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: RowViewHolder, position: Int) {
        holder.setCellWidths(cellWidths)
        holder.bind(data[position], (position == 0))
    }


}