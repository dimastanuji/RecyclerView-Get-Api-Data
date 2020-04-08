package layout

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.example.stap2.R

class CustomController @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyle: Int = 0
    ) : FrameLayout(context, attributeSet,defStyle){

    init {
        LayoutInflater
            .from(context)
            .inflate(
                R.layout.view_custom,
                this,
                true
            )
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
    }

}
