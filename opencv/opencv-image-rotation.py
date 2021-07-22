import cv2, numpy

img = cv2.imread('flower.png')
columns = img.shape[1]
rows = img.shape[0]

rotation_center = (columns/4, rows/4)
angle = 40
rotation_matrix = cv2.getRotationMatrix2D(rotation_center, angle, 0.5)
rotated_image = cv2.warpAffine(img, rotation_matrix, (columns, rows))

cv2.imshow('Image', rotated_image)
cv2.waitKey(0)
cv2.destroyAllWindows()