package com.lyn.style;

/**
 * 支持 : bar
 *
 */
public class BarItemStyle extends ItemStyle {

    /**
     * 圆角半径，单位px，支持传入数组分别指定 4 个圆角半径。
     * 默认值：0
     */
    private BarBorderRadius barBorderRadius;


    public BarBorderRadius getBarBorderRadius() {
        return barBorderRadius;
    }

    public void setBarBorderRadius(BarBorderRadius barBorderRadius) {
        this.barBorderRadius = barBorderRadius;
    }

    public class BarBorderRadius {
        private Double leftUp = 0.0;
        private Double rightUp = 0.0;
        private Double rightDown = 0.0;
        private Double leftDown = 0.0;

        BarBorderRadius() {
        }

        /**
         * 统一设置四个角的圆角大小
         *
         * @param value
         */
        BarBorderRadius(Double value) {
            this.leftUp = value;
            this.rightUp = value;
            this.rightDown = value;
            this.leftDown = value;
        }

        /**
         * 顺时针左上，右上，右下，左下
         *
         * @param leftUp
         * @param rightUp
         * @param rightDown
         * @param leftDown
         */
        BarBorderRadius(Double leftUp, Double rightUp, Double rightDown, Double leftDown) {
            this.leftUp = leftUp;
            this.rightUp = rightUp;
            this.rightDown = rightDown;
            this.leftDown = leftDown;
        }

        public Double getLeftUp() {
            return leftUp;
        }

        public void setLeftUp(Double leftUp) {
            this.leftUp = leftUp;
        }

        public Double getRightUp() {
            return rightUp;
        }

        public void setRightUp(Double rightUp) {
            this.rightUp = rightUp;
        }

        public Double getRightDown() {
            return rightDown;
        }

        public void setRightDown(Double rightDown) {
            this.rightDown = rightDown;
        }

        public Double getLeftDown() {
            return leftDown;
        }

        public void setLeftDown(Double leftDown) {
            this.leftDown = leftDown;
        }
    }

}
