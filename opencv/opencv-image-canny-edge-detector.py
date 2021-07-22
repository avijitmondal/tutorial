import cv2, numpy

img = cv2.imread('flower.png')

threshold1 = 100
threshold2 = 200
blur_image = cv2.Canny(img, threshold1, threshold2)

cv2.imshow('Canny Edge Filter Image', blur_image)
cv2.waitKey(0)
cv2.destroyAllWindows()