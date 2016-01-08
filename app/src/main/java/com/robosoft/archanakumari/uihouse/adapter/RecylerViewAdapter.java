package com.robosoft.archanakumari.uihouse.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.robosoft.archanakumari.uihouse.R;

/**
 * Created by archanakumari on 2/1/16.
 */
public class RecylerViewAdapter  extends RecyclerView.Adapter<RecylerViewAdapter.RecyclerViewHolder>{

    private Context mContext;
    private View mOneRow;
    LayoutInflater layoutInflater;
    private int sCount = 0;
    int mListofImages[] = {R.drawable.imagefive,R.drawable.imagefour,R.drawable.imageone,R.drawable.imagethree,R.drawable.imagetwo};

    public RecylerViewAdapter(Context mContext) {
        this.mContext = mContext;
        layoutInflater = LayoutInflater.from(mContext);
        Log.i("HEllo", "I am in onCreateViewHOlder");
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType%2==0) {
            mOneRow =layoutInflater.inflate(R.layout.child, parent, false);
            Log.i("HEllo", "I am in onCreateViewHOlder");
        }
        else
        {
            mOneRow = layoutInflater.inflate(R.layout.childtwo, parent, false);
        }
        RecyclerViewHolder layoutHolder = new RecyclerViewHolder(mOneRow);
        return layoutHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        Log.i("Hello","Hi i am in onBindViewHolder");
        if(position%2==0){
            Log.i("Hello", "Hi i am in onBindViewHolder of if block");
            holder.mTextHeading.setText("839 pads with 4.9 miles of Santa Monica");
            holder.mMainImage.setImageResource(mListofImages[sCount]);
            holder.mImageDonemark.setImageResource(R.drawable.ok);
            holder.mTextMinute.setText("36 mins ago");
            holder.mTextHousename.setText("101 Ashley St.");
            holder.mImageDollor.setImageResource(R.drawable.ic_attach_money_white_18dp);
            holder.mTextRupees.setText("1,500");
            holder.mImageCar.setImageResource(R.drawable.ic_local_taxi_white_18dp);
            holder.mTextOne.setText("1");
            holder.mImageLocalgrocery.setImageResource(R.drawable.ic_local_grocery_store_white_18dp);
            holder.mOneright.setText("1");
            sCount++;
        }else{

            Log.i("Hello","Hi i am in onBindViewHolder of else block");
            holder.mImageFevorite.setImageResource(R.drawable.ic_favorite_border_black_18dp);
            holder.mTextNumber.setText("16");
            holder.mImageMore.setImageResource(R.drawable.ic_more_horiz_black_18dp);
            holder.mTextMore.setText("More");
            holder.mTextMap.setText("Map");

        }
    }


    @Override
    public int getItemCount() {
        Log.i("Hellow","Hi i am in getItemCount");
        return 6;
    }

    @Override
    public int getItemViewType(int position) {
        Log.i("Hellow","Hi i am in getItemViewType()");
        return position;
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder{
        private TextView mTextHeading;
        private ImageView mMainImage;
        private ImageView mImageDonemark;
        private TextView mTextMinute;
        private TextView mTextHousename;
        private ImageView mImageDollor;
        private TextView mTextRupees;
        private ImageView mImageCar;
        private TextView mTextOne;
        private ImageView mImageLocalgrocery;
        private TextView mOneright;
        private ImageView mImageFevorite;
        private TextView mTextNumber;
        private ImageView mImageMore;
        private TextView mTextMore;
        private TextView mTextMap;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            Log.i("Hello","Hi i am in RecyclerViewHolder");
            mTextHeading = (TextView) itemView.findViewById(R.id.heading);
            mMainImage = (ImageView) itemView.findViewById(R.id.image);
            mImageDonemark = (ImageView) itemView.findViewById(R.id.okbtn);
            mTextMinute = (TextView) itemView.findViewById(R.id.text2);
            mTextHousename = (TextView) itemView.findViewById(R.id.text3);
            mImageDollor = (ImageView) itemView.findViewById(R.id.dolorimage);
            mTextRupees = (TextView) itemView.findViewById(R.id.rupees);
            mImageCar = (ImageView) itemView.findViewById(R.id.car);
            mTextOne = (TextView) itemView.findViewById(R.id.one);
            mImageLocalgrocery = (ImageView) itemView.findViewById(R.id.localgrocery);
            mOneright = (TextView) itemView.findViewById(R.id.oneright);
            mImageFevorite = (ImageView) itemView.findViewById(R.id.fevoriteimage);
            mTextNumber = (TextView) itemView.findViewById(R.id.firsttextofchildtwo);
            mImageMore = (ImageView) itemView.findViewById(R.id.moreimag);
            mTextMore= (TextView) itemView.findViewById(R.id.secondtextofchildtwo);
            mTextMap = (TextView) itemView.findViewById(R.id.thirdtextofchildtwo);

        }
    }
}
