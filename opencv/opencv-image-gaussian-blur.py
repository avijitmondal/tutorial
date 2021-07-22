import cv2, numpy

img = cv2.imread('flower.png')

''' .   @param ksize Gaussian kernel size. ksize.width and ksize.height can differ but they both must be
    .   positive and odd. Or, they can be zero's and then they are computed from sigma.
    .   @param sigmaX Gaussian kernel standard deviation in X direction.'''

matrix = (0, 0)
blur_image = cv2.GaussianBlur(img, ksize=matrix, sigmaX=1)

cv2.imshow('Gaussian Image', blur_image)
cv2.waitKey(0)
cv2.destroyAllWindows()