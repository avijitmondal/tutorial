import cv2, numpy

img = cv2.imread('taj-rgb-noise.jpg')

weight = 2
color = 100
space = 100
blur_image = cv2.bilateralFilter(img, weight, color, space)

cv2.imshow('Bilateral Image', img)
cv2.waitKey(0)
cv2.destroyAllWindows()