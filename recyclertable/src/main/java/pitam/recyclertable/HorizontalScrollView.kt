package pitam.recyclertable

import android.content.Context
import android.util.AttributeSet
import android.widget.HorizontalScrollView


class HorizontalScrollView : HorizontalScrollView {
    private var listener: IHScrollListener? = null

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?, defStyle: Int) : super(
        context, attrs, defStyle
    )

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)

    fun setScrollViewListener(listener: IHScrollListener?) {
        this.listener = listener
    }

    override fun onScrollChanged(l: Int, t: Int, oldl: Int, oldt: Int) {
        super.onScrollChanged(l, t, oldl, oldt)
        listener?.onScrollChanged(this, l, t, oldl, oldt)
    }

    interface IHScrollListener {
        fun onScrollChanged(scrollView: pitam.recyclertable.HorizontalScrollView?, x: Int, y: Int, oldx: Int, oldy: Int)
    }

}