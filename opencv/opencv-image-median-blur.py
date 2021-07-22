import cv2, numpy

img = cv2.imread('taj-rgb-noise.jpg')

kernel = 9
blur_image = cv2.medianBlur(img, kernel)

cv2.imshow('Median Image', img)
cv2.waitKey(0)
cv2.destroyAllWindows()