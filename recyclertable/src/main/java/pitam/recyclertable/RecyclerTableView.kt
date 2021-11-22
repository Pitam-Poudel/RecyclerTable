package pitam.recyclertable

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import pitam.recyclertable.databinding.LayoutRecyclerTableBinding

class RecyclerTableView(context: Context, attrs: AttributeSet?) :
    LinearLayout(context, attrs) {
    val rvAdapter: RecyclerTableAdapter by lazy {
        RecyclerTableAdapter()
    }
    init {
        val binding: LayoutRecyclerTableBinding = DataBindingUtil.inflate(
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater,
            R.layout.layout_recycler_table,
            this,
            true
        )
        binding.recyclerView.adapter = rvAdapter
    }

}